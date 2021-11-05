package com.practice.algorithms;

public class FindMergeNode {

	public static void main(String[] args) {
		findMergeNode(head1,head2);
		findMergeNodeSol2(head1,head2);
	}
		
	static int findMergeNodeSol1(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
	       
        Set<SinglyLinkedListNode> nodes = new HashSet();
        
       while(head1!=null){
           nodes.add(head1);
           head1 = head1.next ;
       }
        
        while(head2!=null){
            if(nodes.contains(head2)){
                return head2.data;
            }
            head2 = head2.next;
        }
        return -1;
        
    }
	
	static int size(SinglyLinkedListNode head){
        int count = 0 ;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count ;
    }
    
    static int findMergeNodeSol2(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        int size1 = size(head1);
        int size2 = size(head2);
        int x = size2-size1;
       
        if(x>0){
            for(int i =1; i<=x;i++){
                 head2 = head2.next;
            }    
           
            }
        else{
            x = -1*x;
            for(int i=1; i<=x;i++){
                 head1 = head1.next;
            }    
          
        }
        
        while(head1!=null){
            
            if(head1==head2){
                return head1.data;
            }else{
                  head1=head1.next;
                  head2=head2.next;
            }
                
            
        }
        return -1;
        
    }
}
