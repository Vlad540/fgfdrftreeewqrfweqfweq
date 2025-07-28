package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: ze3  reason: default package */
public final class ze3 {
    public int a;
    public int b;
    public float c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gwb.PropertySet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == gwb.PropertySet_android_alpha) {
                this.c = obtainStyledAttributes.getFloat(index, this.c);
            } else if (index == gwb.PropertySet_android_visibility) {
                int i2 = obtainStyledAttributes.getInt(index, this.a);
                this.a = i2;
                this.a = bf3.d[i2];
            } else if (index == gwb.PropertySet_visibilityMode) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == gwb.PropertySet_motionProgress) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
