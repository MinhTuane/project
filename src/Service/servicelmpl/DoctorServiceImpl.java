package Service.servicelmpl;

import java.sql.Connection;
import java.util.List;

import Connection.JDBCConnection;
import Model.Doctor;
import Model.Patient;
import Service.DoctorService;

public class DoctorServiceImpl implements DoctorService {

    private Connection con = new JDBCConnection().getConnect();

    @Override
    public Doctor findById(String doctorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<String> getAllDoctorName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDoctorName'");
    }

    @Override
    public List<Patient> getAllPatientById(String doctorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPatientById'");
    }

    @Override
    public void deleteById(String doctorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveDoctor'");
    }

}
