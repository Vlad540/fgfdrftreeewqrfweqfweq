package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ubc  reason: default package */
public abstract class ubc {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, (vx3) null, false, false);
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, vx3 vx3, boolean z, boolean z2) {
        int i3 = i;
        TypedValue typedValue2 = typedValue;
        int i4 = i2;
        vx3 vx32 = vx3;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue2.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (charSequence2.startsWith("res/")) {
                Typeface typeface2 = (Typeface) gte.b.c(gte.d(resources, i, charSequence2, typedValue2.assetCookie, i4));
                if (typeface2 != null) {
                    if (vx32 != null) {
                        new Handler(Looper.getMainLooper()).post(new sbc(vx32, 0, typeface2));
                    }
                    typeface = typeface2;
                } else if (!z2) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            yt5 H = xs7.H(resources.getXml(i), resources);
                            if (H != null) {
                                typeface = gte.b(context, H, resources, i, charSequence2, typedValue2.assetCookie, i2, vx3, z);
                            } else if (vx32 != null) {
                                vx32.e(-3);
                            }
                        } else {
                            Typeface c2 = gte.c(resources, i, charSequence2, typedValue2.assetCookie, i4);
                            if (vx32 != null) {
                                if (c2 != null) {
                                    new Handler(Looper.getMainLooper()).post(new sbc(vx32, 0, c2));
                                } else {
                                    vx32.e(-3);
                                }
                            }
                            typeface = c2;
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        if (vx32 != null) {
                            vx32.e(-3);
                        }
                    }
                }
            } else if (vx32 != null) {
                vx32.e(-3);
            }
            if (typeface != null || vx32 != null || z2) {
                return typeface;
            }
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
    }
}
