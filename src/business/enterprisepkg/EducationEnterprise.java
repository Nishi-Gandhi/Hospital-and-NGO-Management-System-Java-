/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprisepkg;

import business.enterprisepkg.Enterprise.EnterpriseType;
import business.rolepkg.Role;
import java.util.ArrayList;

/**
 *
 * @author hardik
 */
public class EducationEnterprise extends Enterprise{
    
     public EducationEnterprise(String name) {
        super(name, EnterpriseType.Education);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
