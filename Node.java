
public class Node {

 private int id = 0;
 private String name = "";
 private Node next;

 public Node(int i, String n) {
  id = i;
  name = n;
 }

 public int getId() {
  return id;
 }

 public void setId(int a) {
  id = a;
 }

 public String getName() {
  return name;
 }

 public void setName(String b) {
  name = b;
 }

 public Node getNext() {
  return next;
 }

 public void setNext(Node c) {
  next = c;
 }
 

}