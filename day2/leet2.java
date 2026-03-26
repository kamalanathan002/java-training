int removeDuplicates(int* nums, int numsSize) {
    int n=numsSize;
    //int arr[100];
    int count=1;
    for(int i=1;i<n;i++)
    {
        if(nums[i]!=nums[i-1])
        {
            nums[count]=nums[i];
            count++;
        }
    }
    return count;
}