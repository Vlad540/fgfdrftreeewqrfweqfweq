package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;

/* renamed from: af6  reason: default package */
public final class af6 extends RelativeSizeSpan implements uu7, Parcelable {
    public static final Parcelable.Creator<af6> CREATOR = new ze6(0);
    public final float a;
    public final int b;

    public /* synthetic */ af6() {
        this(1.3f);
    }

    public final qt3 copy() {
        return new af6(this.a);
    }

    public final int getType() {
        return this.b;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
    }

    public af6(float f) {
        super(f);
        this.a = f;
        this.b = 8;
    }
}
