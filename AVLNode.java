class AVLNode {
    String key;
    int height;
    AVLNode left, right;

    AVLNode(String key) {
        this.key = key;
        this.height = 1;
    }
}
