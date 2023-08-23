package com.bootcoding.patient.service;

import com.bootcoding.patient.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service

    public class PatientService {
        public List<Patient> getPPatient(){
            return patientList;
        }

        private List<Patient> patientList = new ArrayList<>();

        public boolean registerNewPatient(Patient patient) {
            patientList.add(patient);
            return true;
        }
        public boolean registerNewPatient(List<Patient> patient) {
            for(Patient p: patient){
                registerNewPatient(p);
            }
            return true;
        }


        public Patient getPatientById(int id) {
            for (Patient p: patientList) {
                if(id == p.getId()){
                    return p;
                }
            }
            return null;
        }

        public List<Patient> getAllPatient() {
            return null;
        }
    }