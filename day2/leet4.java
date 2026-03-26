/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int j=-1,c=-1;
    *returnSize=2;
    int* result = (int*)malloc((*returnSize)* sizeof(int));
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]==target)
        {
            if(j==-1)j=i;
            c=i;
        }
    }
    result[0]=j;
    result[1]=c;
    return result;
}