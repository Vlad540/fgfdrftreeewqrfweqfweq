package defpackage;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: t20  reason: default package */
public abstract class t20 {
    public static w20 a(AudioManager audioManager, k20 k20) {
        List x = audioManager.getDirectProfilesForAttributes((AudioAttributes) k20.b().b);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(xie.f(12)));
        for (int i = 0; i < x.size(); i++) {
            AudioProfile i2 = p20.i(x.get(i));
            if (i2.getEncapsulationType() != 1) {
                int y = i2.getFormat();
                if (!oze.L(y)) {
                    if (!w20.e.containsKey(Integer.valueOf(y))) {
                    }
                }
                if (hashMap.containsKey(Integer.valueOf(y))) {
                    Set set = (Set) hashMap.get(Integer.valueOf(y));
                    set.getClass();
                    set.addAll(xie.f(i2.getChannelMasks()));
                } else {
                    hashMap.put(Integer.valueOf(y), new HashSet(xie.f(i2.getChannelMasks())));
                }
            }
        }
        ts6 i3 = ws6.i();
        for (Map.Entry entry : hashMap.entrySet()) {
            i3.a(new u20(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new w20(i3.j());
    }

    public static i30 b(AudioManager audioManager, k20 k20) {
        try {
            audioManager.getClass();
            List p = audioManager.getAudioDevicesForAttributes((AudioAttributes) k20.b().b);
            if (p.isEmpty()) {
                return null;
            }
            return new i30((AudioDeviceInfo) p.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
