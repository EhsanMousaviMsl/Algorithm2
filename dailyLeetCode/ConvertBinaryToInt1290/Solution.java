package dailyLeetCode.ConvertBinaryToInt1290;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public static class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
  public static int getDecimalValue(ListNode head) {
    ListNode current = head;
    List<Integer> arr = new ArrayList<>();
    while(current != null) {
      arr.add(current.val);
      current = current.next;
    }
    int n = arr.size() - 1;
    int ans = 0;
    int j = 0;

    for (int i = n; i>=0; i--){
      ans += arr.get(i) * (int)Math.pow(2, j);
      j++;
    }

    return ans;
  }

  public static void main (String[] args) {
    ListNode head = new ListNode(1);
    ListNode second = new ListNode(0);
    ListNode third = new ListNode(1);
    head.next = second;
    second.next = third;

    int ans = getDecimalValue(head);
    System.err.println(ans);

    
  }


}