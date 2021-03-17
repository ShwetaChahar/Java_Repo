package org.apex.exercise;

import java.util.List;
import java.util.Arrays;

public class WeightedAverage
{
    public static double mean(List<Integer> numbers, List<Integer> weights)
    {
        if (numbers.size()!= weights.size()) 
            throw new IllegalArgumentException();
        long  total = 0;
        long  totalWeights = 0;
        for (int i = 0; i < numbers.size(); i++)
        {
            total += numbers.get(i) * weights.get(i);
            totalWeights += weights.get(i);
        }

        return (double)total / (double)totalWeights;
    }

    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(new Integer[] { 3, 6 });
        List<Integer> b = Arrays.asList(new Integer[] { 4, 2 });

        System.out.println(WeightedAverage.mean(a, b));
    }
}