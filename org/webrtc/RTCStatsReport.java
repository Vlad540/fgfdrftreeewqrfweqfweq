package org.webrtc;

import java.util.Map;

public class RTCStatsReport {
    private final Map<String, RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long j, Map<String, RTCStats> map) {
        this.timestampUs = j;
        this.stats = map;
    }

    @CalledByNative
    private static RTCStatsReport create(long j, Map map) {
        return new RTCStatsReport(j, map);
    }

    public Map<String, RTCStats> getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return (double) this.timestampUs;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ timestampUs: ");
        sb.append(this.timestampUs);
        sb.append(", stats: [\n");
        boolean z = true;
        for (RTCStats next : this.stats.values()) {
            if (!z) {
                sb.append(",\n");
            }
            sb.append(next);
            z = false;
        }
        sb.append(" ] }");
        return sb.toString();
    }
}
