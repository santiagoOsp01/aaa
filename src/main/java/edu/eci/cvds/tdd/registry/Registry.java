package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;
        if (p.getAge() <= 0 || p.getAge() > 110){
            result = RegisterResult.INVALID_AGE;
        } else if (p.getAge() < 18 && p.getAge() > 0){
            result =  RegisterResult.UNDERAGE;
        } else if (p.getAge() >= 18 && p.getAge() < 110) {
            result =  RegisterResult.VALID;
        }
        return result;
    }
    public Name registerName(Person p) {
        Name result = null;
        if ((p.getName()).length() <= 0 || (p.getName()).length() > 30){
            result = Name.InValidName;
        } else{
            result =  Name.ValidName;
        }
        return result;
    }

    public Gender registerGender(Person p) {
        Gender result = null;
        if (p.getGender().equals(Gender.MALE)){
            result = Gender.MALE;
        } else if(p.getGender().equals(Gender.FEMALE)){
            result =  Gender.FEMALE;
        }else {
            result =  Gender.UNIDENTIFIED;
        }
        return result;
    }

    public Ids registerVoterId(Person p) {
        Ids result = null;
        int l = Integer.toString(p.getId()).length();
        if (l > 6 && l < 10){
            result = Ids.VALID_ID;
        } else {
            result =  Ids.INVALID_ID;
        }
        return result;
    }

    public RegisterResult registerAlive(Person p){
        RegisterResult result = null;
        if (p == null){
            result = RegisterResult.INVALID;
        } else if (!p.isAlive()){
            result = RegisterResult.DEAD;
        } else {
            result = RegisterResult.VALID;
        }
        return result;
    }
}
