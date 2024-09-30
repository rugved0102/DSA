#include <stdio.h>

int main() {
    int n = 3;

    // Pre-increment and post-increment behavior
    printf("%d %d %d\n", ++n, n, n++);  // Pre-increment, current value, and post-increment
    printf("%d %d\n", n++, n++);  // Post-increment, post-increment

    return 0;
}
