/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.Account;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userInterface.HospitalAdminWorkSpace.HospitalAdminWorkArea;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{
 @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalAdminWorkArea(userProcessContainer, enterprise);
    }
    
}
