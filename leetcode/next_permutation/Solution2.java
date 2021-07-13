class Solution2 {
    public void nextPermutation(int[] A) {
        if (A == null || A.length <= 1) return;
        int i = A.length - 2;
        while (i >= 0 && A[i] >= A[i + 1]) i--; // 첫 번째로 작아지는 위치 찾기
        if (i >= 0) {                           // 만약에 내림차순이 아니라면
            int j = A.length - 1;              // 종점부터 시작해서
            while (A[j] <= A[i]) j--;           // 왼쪽에서 큰부분보다 큰 값이 나올 때까지 순환한다.
            swap(A, i, j);                     // 왼쪽에서 큰 값과 오른쪽에서 왼쪽에서 큰 값보다 큰 값중 작은 값을 바꾼다.
        }
        reverse(A, i + 1, A.length - 1);       // 그리고 나서 정렬
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public void reverse(int[] A, int i, int j) {
        while (i < j) swap(A, i++, j--);
    }
}