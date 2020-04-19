import java.util.HashSet;

public class DeleteDups {
	public static void deleteDups(LinkedListNode n) {
        Set<Integer> set = new HashSet<Integer>();
        LinkedlistNode pointer = null;
        while(pointer.next != null) { 
            if(!set.contains(pointer.data)) { 
                set.add(pointer.data);
                pointer = n;
            } else { 
                pointer.next = n.next;
            }
            n = n.next;
        }
 	}
	
	public static void main(String[] args) {	
		LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		deleteDups(head);
		System.out.println(head.printForward());
	}
}