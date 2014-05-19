/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hannes.scuba.services.impl;

import com.hannes.scuba.services.EncryptPasswordService;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hannes
 */
@Service("EncryptPasswordService")
public class EncryptPasswordServiceImpl implements EncryptPasswordService{

    @Override
    public String getEncryptedPassword(String password) {
        StringBuffer getString = new StringBuffer();
        try {
            MessageDigest msg = MessageDigest.getInstance("MD5", "SUN");
            byte bs[] = password.getBytes();
            byte digest[] = msg.digest(bs);
            for(int i=0;i<digest.length;++i) {
                getString.append(Integer.toHexString(0x0100 + (digest[i] & 0x00ff)).substring(1));
            }
        }
        catch(NoSuchAlgorithmException ex) {
            //ex.printStackTrace();
        }
        catch(NoSuchProviderException ex) {
            //ex.printStackTrace();
        }
        
        return getString.toString();
    }
    
}
