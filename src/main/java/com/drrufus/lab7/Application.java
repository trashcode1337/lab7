package com.drrufus.lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {
    
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter business name: ");
            String businessName = br.readLine();
            System.out.print("Enter service name: ");
            String serviceName = br.readLine();
            System.out.print("Enter access point url: ");
            String apoint = br.readLine();
            JuddiReg.register(businessName, serviceName, apoint);
            JuddiSearch.search(new String[] {serviceName});
        }
        catch (Exception e) {
            System.err.println("Oppa, some weird error here:");
            System.err.println(e.getMessage());
        }
    }
}
