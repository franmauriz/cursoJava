package mauriz.fran.dto;

public class EmpleadoDTO {
    private int emp_id;
    private String nombre;
    private String depto_id;
    private String email;
    private String puesto;
    private String fecha_creacion;
    private float salario;

    public EmpleadoDTO(){}

    public EmpleadoDTO(int emp_id){
        this.emp_id = emp_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(String depto_id) {
        this.depto_id = depto_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "EmpleadoDTO{" +
                "emp_id=" + emp_id +
                ", nombre='" + nombre + '\'' +
                ", depto_id='" + depto_id + '\'' +
                ", email='" + email + '\'' +
                ", puesto='" + puesto + '\'' +
                ", fecha_creacion='" + fecha_creacion + '\'' +
                ", salario=" + salario +
                '}';
    }
}
