import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeListSieve {

    private List<Integer> primes;
    private int endSegment;
    private int extendAtMostNSegmentsTarget;

    public PrimeListSieve() {
        primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        endSegment = 1;
        extendAtMostNSegmentsTarget = 10;
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    private void extendAtMostNSegments(int n) {
        int k = endSegment;
        n = Math.min(n, primes.size() - 1 - k);
        int p = primes.get(k);
        int q = primes.get(k + n);
        List<Integer> segment = IntStream.range(p * p, q * q)
                .boxed().collect(Collectors.toList());
        int segmentMin = segment.get(0);
        int segmentLen = segment.size();
        boolean[] isPrime = new boolean[segmentLen];
        for (int i = 0; i < segmentLen; i++) {
            isPrime[i] = true;
        }
        Iterator<Integer> iterator = primes.subList(0, k + n).iterator();
        while (iterator.hasNext()) {
            int pk = iterator.next();
            int start = smallestMultipleOfNGeqM(pk, segmentMin);
            for (int i = start - segmentMin; i < segmentLen; i += pk) {
                isPrime[i] = false;
            }
        }
        for (int i = 0; i < segmentLen; i++) {
            if (isPrime[i]) {
                primes.add(segment.get(i));
            }
        }
        endSegment += n;
    }

    private int smallestMultipleOfNGeqM(int n, int m) {
        return n * ((m + n - 1) / n);
    }

 
}
