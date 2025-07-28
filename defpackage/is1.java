package defpackage;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import java.util.LinkedHashSet;

/* renamed from: is1  reason: default package */
public final /* synthetic */ class is1 {
    public static mn a(Context context, Object obj, LinkedHashSet linkedHashSet) {
        try {
            return new mn(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new Exception(e);
        }
    }
}
