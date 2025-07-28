package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ok6  reason: default package */
public abstract class ok6 {
    public static final re6[] a;
    public static final Map b;

    static {
        re6 re6 = r1;
        re6 re62 = new re6(re6.i, BuildConfig.FLAVOR);
        re6 re63 = r2;
        uu0 uu0 = re6.f;
        re6 re64 = new re6(uu0, "GET");
        re6 re65 = r4;
        re6 re66 = new re6(uu0, "POST");
        re6 re67 = r4;
        uu0 uu02 = re6.g;
        re6 re68 = new re6(uu02, "/");
        re6 re69 = r6;
        re6 re610 = new re6(uu02, "/index.html");
        re6 re611 = r6;
        uu0 uu03 = re6.h;
        re6 re612 = new re6(uu03, "http");
        re6 re613 = r8;
        re6 re614 = new re6(uu03, "https");
        re6 re615 = r8;
        uu0 uu04 = re6.e;
        re6 re616 = new re6(uu04, "200");
        re6 re617 = r9;
        re6 re618 = new re6(uu04, "204");
        re6 re619 = r10;
        re6 re620 = new re6(uu04, "206");
        re6 re621 = r11;
        re6 re622 = new re6(uu04, "304");
        re6 re623 = r12;
        re6 re624 = new re6(uu04, "400");
        re6 re625 = r13;
        re6 re626 = re6;
        re6 re627 = new re6(uu04, "404");
        re6 re628 = r0;
        re6 re629 = re63;
        re6 re630 = new re6(uu04, "500");
        re6 re631 = r0;
        re6 re632 = new re6("accept-charset", BuildConfig.FLAVOR);
        String str = BuildConfig.FLAVOR;
        re6 re633 = r0;
        re6 re634 = new re6("accept-encoding", "gzip, deflate");
        re6 re635 = r0;
        re6 re636 = new re6("accept-language", str);
        re6 re637 = r0;
        re6 re638 = new re6("accept-ranges", str);
        re6 re639 = r0;
        re6 re640 = new re6("accept", str);
        re6 re641 = r0;
        re6 re642 = new re6("access-control-allow-origin", str);
        re6 re643 = r0;
        re6 re644 = new re6("age", str);
        re6 re645 = r0;
        re6 re646 = new re6("allow", str);
        re6 re647 = r0;
        re6 re648 = new re6("authorization", str);
        re6 re649 = r0;
        re6 re650 = new re6("cache-control", str);
        re6 re651 = r0;
        re6 re652 = new re6("content-disposition", str);
        re6 re653 = r0;
        re6 re654 = new re6("content-encoding", str);
        re6 re655 = r0;
        re6 re656 = new re6("content-language", str);
        re6 re657 = r0;
        re6 re658 = new re6("content-length", str);
        re6 re659 = r0;
        re6 re660 = new re6("content-location", str);
        re6 re661 = r0;
        re6 re662 = new re6("content-range", str);
        re6 re663 = r0;
        re6 re664 = new re6("content-type", str);
        re6 re665 = r0;
        re6 re666 = new re6("cookie", str);
        re6 re667 = r0;
        re6 re668 = new re6("date", str);
        re6 re669 = r0;
        re6 re670 = new re6("etag", str);
        re6 re671 = r0;
        re6 re672 = new re6("expect", str);
        re6 re673 = r0;
        re6 re674 = new re6("expires", str);
        re6 re675 = r0;
        re6 re676 = new re6("from", str);
        re6 re677 = r0;
        re6 re678 = new re6("host", str);
        re6 re679 = r0;
        re6 re680 = new re6("if-match", str);
        re6 re681 = r0;
        re6 re682 = new re6("if-modified-since", str);
        re6 re683 = r0;
        re6 re684 = new re6("if-none-match", str);
        re6 re685 = r0;
        re6 re686 = new re6("if-range", str);
        re6 re687 = r0;
        re6 re688 = new re6("if-unmodified-since", str);
        re6 re689 = r0;
        re6 re690 = new re6("last-modified", str);
        re6 re691 = r0;
        re6 re692 = new re6("link", str);
        re6 re693 = r0;
        re6 re694 = new re6("location", str);
        re6 re695 = r0;
        re6 re696 = new re6("max-forwards", str);
        re6 re697 = r0;
        re6 re698 = new re6("proxy-authenticate", str);
        re6 re699 = r0;
        re6 re6100 = new re6("proxy-authorization", str);
        re6 re6101 = r0;
        re6 re6102 = new re6("range", str);
        re6 re6103 = r0;
        re6 re6104 = new re6("referer", str);
        re6 re6105 = r0;
        re6 re6106 = new re6("refresh", str);
        re6 re6107 = r0;
        re6 re6108 = new re6("retry-after", str);
        re6 re6109 = r0;
        re6 re6110 = new re6("server", str);
        re6 re6111 = r0;
        re6 re6112 = new re6("set-cookie", str);
        re6 re6113 = r0;
        re6 re6114 = new re6("strict-transport-security", str);
        re6 re6115 = r0;
        re6 re6116 = new re6("transfer-encoding", str);
        re6 re6117 = r0;
        re6 re6118 = new re6("user-agent", str);
        re6 re6119 = r0;
        re6 re6120 = new re6("vary", str);
        re6 re6121 = r0;
        re6 re6122 = new re6("via", str);
        re6 re6123 = r0;
        re6 re6124 = new re6("www-authenticate", str);
        re6[] re6Arr = {re626, re629, re65, re67, re69, re611, re613, re615, re617, re619, re621, re623, re625, re628, re631, re633, re635, re637, re639, re641, re643, re645, re647, re649, re651, re653, re655, re657, re659, re661, re663, re665, re667, re669, re671, re673, re675, re677, re679, re681, re683, re685, re687, re689, re691, re693, re695, re697, re699, re6101, re6103, re6105, re6107, re6109, re6111, re6113, re6115, re6117, re6119, re6121, re6123};
        a = re6Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(re6Arr[i].b)) {
                linkedHashMap.put(re6Arr[i].b, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(uu0 uu0) {
        int c = uu0.c();
        for (int i = 0; i < c; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte f = uu0.f(i);
            if (b2 <= f && b3 >= f) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(uu0.j()));
            }
        }
    }
}
