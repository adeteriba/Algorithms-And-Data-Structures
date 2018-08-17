/*

Problem Statement
A loop in a linked list occurs when following the linked list chain brings you back where you started. 
For example, link 1 points to link 2 which points to link 3 which points to link 1, to link 2, to link 3, to link 1...
and you go round in an infinite loop. Each test case here involves a single-ended singly-linked list with a potential loop. 
Output the size of the loop, or 0 if there is no loop. 
In the above example, the loop is of size 3 (e.g. link 1, link 2, link 3...repeating forever).

Input Format
There is no input. The linked list is created automatically.

Output Format
Output an integer, either 0 if the linked list is empty or has no loop, or else >0 corresponding to the length of the loop in the linked list.

Constraints
0≤#(links)≤100

*/

public static int findLoopLength(LinkedList myList){

   if(myList.isEmpty())

            return 0;

        Link current = myList.first;
        int count = 0;
        Link arr[] = new Link[100];
        while(current.next != null)

        {

            arr[count] = current;
            for(int i = 0; i < count; i++)
                if(arr[i] == current)

                    return count-i;

            count++;
            current = current.next;

        }

        return 0;

   }
