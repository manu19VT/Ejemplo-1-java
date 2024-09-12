package alumnos;

public class alumno {
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String CURP;
    private String telefono;
    private String correo;
    private boolean discapacidad;
    private String sexo;;





    public alumno(String nombre,String apaterno,String amaterno,String CURP,String telefono,String correo,boolean discapacidad,String sexo)
    {
        this.nombre=nombre;
        this.apaterno=apaterno;
        this.amaterno=amaterno;
        this.CURP=CURP;
        this.telefono=telefono;
        this.correo=correo;
        this.discapacidad=discapacidad;
        this.sexo=sexo;


    }
    public String getNombre() {
        return nombre;
    }
    public String getAPaterno() {
        return apaterno;
    }
    public String getAMaterno() {
        return amaterno;
    }

    public String getCURP() {
        return CURP;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public boolean isDiscapacidad() {
        return discapacidad;
    }
    public String getSexo() {
        return sexo;
    }
    public String getDiscapacidad(){
        if(discapacidad==true)
            return "Si";
        else
            return "No";
    }

    public int calcularEdad() {

        String fechaNac = CURP.substring(4, 10);


        int año = Integer.parseInt(fechaNac.substring(0, 2));
        int mes = Integer.parseInt(fechaNac.substring(2, 4));
        int dia = Integer.parseInt(fechaNac.substring(4, 6));


        if (año >= 0 && año <= 23) {
            año += 2000;
        } else {
            año += 1900;
        }


        java.time.LocalDate fechaActual = java.time.LocalDate.now();
        int añoActual = fechaActual.getYear();
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();


        int edad = añoActual - año;


        if (mes > mesActual || (mes == mesActual && dia > diaActual)) {
            edad--;
        }

        return edad;
    }
}
