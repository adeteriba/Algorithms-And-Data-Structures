/*

Problem Statement
Go through the double-ended doubly-linked list to find the largest int value held in any of the links. If the doubly-linked list is empty or defective in any way, return 0. 
The main method is already completed, you simply have to write the search() method which reports to the main method.

Input Format
There is no input. The linked list is created automatically.

Output Format
Output the largest value held in any of the links. If the linked list is empty or defective output 0.

*/

 public static int search(LinkedList mylist){

        /* return the highest value held in any of the links, 0 if defective or empty*/

        if (mylist.isEmpty()){
            return 0;

        } else if(mylist.first==null){
            return 0;

        } else {

            int max =0;
            Link current = mylist.first;
            Link test;
            if (mylist.first.data>0){

                max = mylist.first.data;

            }

            while (current.next!=null){

                test =current;
                current = current.next;

                if (current.previous!=test){
                    return 0;
                }

               
                if (current.data > max){
                    max = current.data;
                }

            }

            return max;

        }

    }
