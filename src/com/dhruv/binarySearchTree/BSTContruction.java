package com.dhruv.binarySearchTree;

public class BSTContruction {

    static class BST {

        public int value;
        public BST left;
        public BST right;

        public BST(int value){
            this.value = value;
            left = null;
            right = null;
        }

        private BST insert(int value){
            BST currentNode = this;
            while(true){
                if(currentNode.value > value){
                    if(currentNode.left == null){
                        currentNode.left = new BST(value);
                        break;
                    }else{
                            currentNode = currentNode.left;
                    }
                }
                else{
                    if(currentNode.value < value){
                        if(currentNode.right == null){
                            currentNode.right = new BST(value);
                            break;
                        }else{
                            currentNode = currentNode.right;
                        }
                    }
                }
            }
            return this;
        }

        private boolean contains(int value){
            BST currentNode = this;
            while(currentNode != null){
                if(currentNode.value > value){
                    currentNode = currentNode.left;
                }
                else if (currentNode.value < value){
                    currentNode = currentNode.right;
                }
                else{
                    return true;
                }
            }
            return false;
        }

        public BST remove(int value){
            remove(value,null);
            return this;
        }

        public void remove(int value,BST parentNode){
         BST currentNode = this;
         while(currentNode != null){
             if(value < currentNode.value){
                 parentNode = currentNode;
                 currentNode = currentNode.left;
             }else if(value > currentNode.value){
                 parentNode = currentNode;
                 currentNode = currentNode.right;
             }else{

             }
         }
        }


    }
}
