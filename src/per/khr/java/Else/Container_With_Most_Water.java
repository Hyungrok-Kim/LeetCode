package per.khr.java.Else;

public class Container_With_Most_Water {

    public int maxArea(int... height) {
        int startIdx = 0, endIdx = height.length - 1, output = 0;
        while (startIdx < endIdx) {
            int xInterval = endIdx - startIdx;
            int yInterval = height[endIdx] > height[startIdx] ? height[startIdx] : height[endIdx];
            if (xInterval * yInterval > output)
                output = xInterval * yInterval;

            if (height[startIdx] <= height[endIdx])
                startIdx++;
            else
                endIdx--;
        }
        return output;
    }
}
