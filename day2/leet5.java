int removeElement(int* nums, int numsSize, int val) {
    int j=0;
    for(int i=0;i<numsSize;i++)
    {
        if(val!=nums[i])
        {
           nums[j++]=nums[i];
        }
    }
    return j;
}