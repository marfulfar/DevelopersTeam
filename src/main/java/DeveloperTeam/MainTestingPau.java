package DeveloperTeam;


import DeveloperTeam.Model.Entity.Decor;
import DeveloperTeam.Model.Entity.Flower;
import DeveloperTeam.Model.Entity.IArticle;
import DeveloperTeam.Model.Entity.Tree;

import DeveloperTeam.Model.Repository.TxtRepository;

import java.util.ArrayList;
import java.util.List;

//TODO: Implementar repo txt
public class MainTestingPau {
    public static void main(String[] args) {
        TxtRepository repo = new TxtRepository();
        boolean exists = false;

        try {
            exists = repo.exists(23);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("break");
    }
}