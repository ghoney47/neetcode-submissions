class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        output = []
        
        for word in strs:
            if len(output) == 0:
                output.append([word])
            else:
                found = False

                #check if curr word is anagram of anything -> if so, add to that sublist
                for i in range(0, len(output)):
                    if Counter(word) == Counter(output[i][0]):
                        output[i].append(word)
                        found = True
                        break

                if not found:
                    output.append([word])               
                
        return output


