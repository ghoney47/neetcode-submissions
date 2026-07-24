class Solution:
    def maxArea(self, heights: List[int]) -> int:
        i = 0
        j = len(heights) - 1

        max_area = 0


        while i < j:
            temp_area = min(heights[i] * (j - i), heights[j] * (j - i))

            if temp_area > max_area: 
                # print(f"[DEBUG] temp_area overwrites, with i: {}")
                max_area = temp_area
            
            if heights[i] >= heights[j]:
                j -= 1
            else:
                i += 1
        
        return max_area



        