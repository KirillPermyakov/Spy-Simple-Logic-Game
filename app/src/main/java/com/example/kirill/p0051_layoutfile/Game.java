package com.example.kirill.p0051_layoutfile;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kirill on 02.11.2015.
 */
public class Game {
    private int count;
    private int indexOfSpy;

    private String role; //current
    private String whoStarts;
    private ArrayList<Player> listOfPlayers;
    public String roles[] = {"ШКОЛА", "КАЗИНО", "ПСИХУШКА", "ТЕАТР", "СКОТОБОЙНЯ", "БАЗА ТЕРРОРИСТОВ", "СУПЕРМАРКЕТ", "БОРДЕЛЬ" ,"ПАРИКМАХЕРСКАЯ", "СТРОЙКА", "Пиратский Корабль", "Морг", "Птицефабрика", "Киностудия", "Фитнесс-Клуб", "Кофейня", "Ферма"};
    private String[] PlayerOfRole;
    public int Currentcounter;

    public Game() {

    }

   /* public String whoStart
    {
        Random random = new Random ();
        return listOfPlayers.get(random.nextInt(count));
    } */

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getWhoStarts() {
        return whoStarts;
    }

    public void setWhoStarts(String whoStarts) {
        this.whoStarts = whoStarts;
    }

    public ArrayList<Player> getListOfPlayers() {
        return listOfPlayers;
    }

    public void setListOfPlayers(ArrayList<Player> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    public int getCurrentcounter() {
        return Currentcounter;

    }

    public void setCurrentcounter(int currentcounter) {
        Currentcounter = currentcounter;
    }

    public void  initGame(int count) {

        this.count = count;
        initRole();
        this.Currentcounter = 0;
        listOfPlayers = new ArrayList<Player>(count);
        randomRoles();
        initArrayRoles();

    }

    public void initRole ()
    {
        Random random = new Random();
        this.role = roles[random.nextInt(roles.length)];
    }


    public boolean addPlayer (String name)
    {
        Player temp = new Player(name,PlayerOfRole[Currentcounter]);
        listOfPlayers.add(temp);
        Currentcounter++;

        if (listOfPlayers.isEmpty() && Currentcounter>count)
            return false;
        else
            return true;

    }
   /* public boolean IfEnd ()
    {
        if (Currentcounter-1 == count)
            return true;
            else
            return false;
    } */
    public void randomRoles ()
    {
        Random random = new Random();
        indexOfSpy = random.nextInt(count);
      /*  for (int i = 0; i< count; i++)
        {
            if(i==indexOfSpy) {
                Player temp = listOfPlayers.get(i);
                temp.setRole("ШПИОН");
                listOfPlayers.set(i,temp);
            }
            else
            {
                Player temp = listOfPlayers.get(i);
                temp.setRole(role);
                listOfPlayers.set(i,temp);
            }
        }*/
    }
    private void initArrayRoles()
    {
        PlayerOfRole=new String[count];
        for(int i=0; i<count; i++)
        {
            PlayerOfRole[i] = role;

        }
        PlayerOfRole[indexOfSpy] = "ШПИОН";

    }

}
