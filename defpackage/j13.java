package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: j13  reason: default package */
public final class j13 extends CharacterStyle implements UpdateAppearance, Parcelable, uu7 {
    public static final Parcelable.Creator<j13> CREATOR = new h6(27);
    public final int a;
    public final int b;

    public /* synthetic */ j13() {
        this(-65536);
    }

    public final qt3 copy() {
        return new j13();
    }

    public final int describeContents() {
        return 0;
    }

    public final int getType() {
        return this.b;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public j13(int i) {
        this.a = i;
        this.b = 9;
    }

    public j13(Parcel parcel) {
        this(parcel.readInt());
    }
}
