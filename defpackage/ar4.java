package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: ar4  reason: default package */
public abstract class ar4 {
    public static final HashMap a;
    public static final HashMap b;

    static {
        zq4 zq4;
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        zq4 zq42 = zq4.d;
        hashMap.put(1L, zq42);
        hashMap2.put(zq42, Collections.singletonList(1L));
        hashMap.put(2L, zq4.e);
        hashMap2.put((zq4) hashMap.get(2L), Collections.singletonList(2L));
        zq4 zq43 = zq4.f;
        hashMap.put(4L, zq43);
        hashMap2.put(zq43, Collections.singletonList(4L));
        zq4 zq44 = zq4.g;
        hashMap.put(8L, zq44);
        hashMap2.put(zq44, Collections.singletonList(8L));
        List asList = Arrays.asList(new Long[]{64L, 128L, 16L, 32L});
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zq4 = zq4.h;
            if (!hasNext) {
                break;
            }
            a.put((Long) it.next(), zq4);
        }
        b.put(zq4, asList);
        List asList2 = Arrays.asList(new Long[]{Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L});
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            zq4 zq45 = zq4.i;
            if (hasNext2) {
                a.put((Long) it2.next(), zq45);
            } else {
                b.put(zq45, asList2);
                return;
            }
        }
    }

    public static Long a(zq4 zq4, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(zq4);
        if (list == null) {
            return null;
        }
        Set q = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (q.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
