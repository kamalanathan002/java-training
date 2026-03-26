int searchInsert(int* nums, int numsSize, int target) {
    int b=0;
    for(int i=0;i<numsSize;i++)
    {
        if(i==numsSize-1&&nums[i]<target)
        {
            b=i+1;
            break;
        }
        else if(i==numsSize-1&&nums[i]>target)
        {
            b=i;
            break;
        }
        else if(target>nums[i])
        {
            continue;
        }
        else
        {
            b=i;
            break;
        }
    }
    return b;
}