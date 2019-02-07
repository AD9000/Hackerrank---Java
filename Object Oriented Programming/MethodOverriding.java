// Author: Atharv Damle
// Function to demonstrate overriding
// Full Question: https://www.hackerrank.com/challenges/java-method-overriding/problem

@Override
void getNumberOfTeamMembers(){
    System.out.println( "Each team has 11 players in " + getName() );
}
