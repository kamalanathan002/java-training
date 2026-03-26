char* longestCommonPrefix(char** strs, int strsSize) {
    char result[100];
    for(int i=0;i<strsSize-1;i++)
    {
        for(int j=0;j<strlen(strs[i]);j++)
        {
            for(int k=0;k<strlen(strs[i+1]);k++)
            {
                if(strs[j][k]==strs[j+1][k])
                {
                    result[k]=strs[j][k];
                }

            }
        }
    }
    return result;
}