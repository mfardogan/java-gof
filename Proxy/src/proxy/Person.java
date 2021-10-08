/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author mfard
 */
public class Person {

    private final String name;
    private final String surname;
    private final boolean hasADriverLicense;

    public Person(String name, String surname, boolean hasADriverLicense) {
        this.name = name;
        this.surname = surname;
        this.hasADriverLicense = hasADriverLicense;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isHasADriverLicense() {
        return hasADriverLicense;
    }
}
