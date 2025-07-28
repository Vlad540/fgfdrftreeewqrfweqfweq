package ru.ok.messages.settings.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import com.google.android.material.ComGoogleAndroidMaterialR;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0019\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/messages/settings/view/SliderWithCustomTicks;", "Lpjd;", "", "", "valueFrom", "Ljue;", "setValueFrom", "(F)V", "valueTo", "setValueTo", "stepSize", "setStepSize", "", "color", "setBackgroundColor", "(I)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class SliderWithCustomTicks extends pjd implements fi0 {
    public final int O1;
    public float[] P1;
    public boolean Q1;
    public final Paint R1;
    public final Paint S1;
    public final Paint T1;
    public final int U1;
    public final float V1;

    /* JADX WARNING: type inference failed for: r8v0, types: [ru.ok.messages.settings.view.SliderWithCustomTicks, android.view.View, java.lang.Object, pjd, xi0] */
    public SliderWithCustomTicks(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842788});
        if (obtainStyledAttributes.hasValue(0)) {
            setValue(obtainStyledAttributes.getFloat(0, 0.0f));
        }
        obtainStyledAttributes.recycle();
        this.O1 = getResources().getDimensionPixelOffset(vmb.mtrl_slider_track_height);
        this.P1 = new float[0];
        this.Q1 = true;
        Paint paint = new Paint(1);
        this.R1 = paint;
        Paint paint2 = new Paint(1);
        this.S1 = paint2;
        Paint paint3 = new Paint(1);
        this.T1 = paint3;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, xvb.Slider, 0, ComGoogleAndroidMaterialR.style.Widget_MaterialComponents_Slider);
        boolean hasValue = obtainStyledAttributes2.hasValue(xvb.Slider_tickColor);
        int i = hasValue ? xvb.Slider_tickColor : xvb.Slider_tickColorInactive;
        int i2 = hasValue ? xvb.Slider_tickColor : xvb.Slider_tickColorActive;
        paint.setColor(obtainStyledAttributes2.getColor(i, 0));
        paint2.setColor(obtainStyledAttributes2.getColor(i2, 0));
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, zvb.SliderWithCustomTicks, 0, 0);
        int i3 = zvb.SliderWithCustomTicks_tickRadius;
        zg4.b();
        this.U1 = obtainStyledAttributes3.getDimensionPixelSize(i3, dh4.b((int) 4.0f));
        this.V1 = obtainStyledAttributes3.getDimension(zvb.SliderWithCustomTicks_normalValue, 0.0f);
        obtainStyledAttributes3.recycle();
        if (getBackground() instanceof ColorDrawable) {
            paint3.setColor(((ColorDrawable) getBackground()).getColor());
        }
        this.E0.add(this);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        SliderWithCustomTicks.super.onDraw(canvas);
        int i = 0;
        if (this.Q1 && getStepSize() > 0.0f) {
            int min = Math.min((int) (((getValueTo() - getValueFrom()) / getStepSize()) + ((float) 1)), (getTrackWidth() / (getTrackHeight() * 2)) + 1);
            int i2 = min * 2;
            if (this.P1.length != i2) {
                this.P1 = new float[i2];
            }
            float trackWidth = ((float) getTrackWidth()) / ((float) (min - 1));
            for (int i3 = 0; i3 < i2; i3 += 2) {
                this.P1[i3] = (((float) (i3 / 2)) * trackWidth) + ((float) getTrackSidePadding());
                this.P1[i3 + 1] = (float) this.O1;
            }
            this.Q1 = false;
        }
        if (getStepSize() > 0.0f) {
            int value = (int) (getValue() - getValueFrom());
            int valueFrom = (int) (this.V1 - getValueFrom());
            float f = (float) this.U1;
            int length = this.P1.length / 2;
            while (i < length) {
                Paint paint = this.T1;
                Paint paint2 = this.R1;
                Paint paint3 = this.S1;
                if (i == valueFrom && i != value) {
                    float[] fArr = this.P1;
                    int i4 = i * 2;
                    int i5 = i4 + 1;
                    canvas2.drawCircle(fArr[i4], fArr[i5], (float) getThumbRadius(), i < value ? paint3 : paint2);
                    float[] fArr2 = this.P1;
                    canvas2.drawCircle(fArr2[i4], fArr2[i5], f, paint);
                    float[] fArr3 = this.P1;
                    float f2 = fArr3[i4];
                    float f3 = fArr3[i5];
                    float f4 = f / 2.0f;
                    if (i < value) {
                        paint2 = paint3;
                    }
                    canvas2.drawCircle(f2, f3, f4, paint2);
                } else if (i < value) {
                    float[] fArr4 = this.P1;
                    int i6 = i * 2;
                    int i7 = i6 + 1;
                    canvas2.drawCircle(fArr4[i6], fArr4[i7], f, paint3);
                    float[] fArr5 = this.P1;
                    canvas2.drawCircle(fArr5[i6], fArr5[i7], f / 2.0f, paint);
                } else if (i > value) {
                    float[] fArr6 = this.P1;
                    int i8 = i * 2;
                    int i9 = i8 + 1;
                    canvas2.drawCircle(fArr6[i8], fArr6[i9], f, paint2);
                    float[] fArr7 = this.P1;
                    canvas2.drawCircle(fArr7[i8], fArr7[i9], f / 2.0f, paint);
                }
                i++;
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        SliderWithCustomTicks.super.onSizeChanged(i, i2, i3, i4);
        this.Q1 = true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.settings.view.SliderWithCustomTicks, android.view.View] */
    @SuppressLint({"ResourceType"})
    public void setBackgroundColor(int i) {
        SliderWithCustomTicks.super.setBackgroundColor(i);
        this.T1.setColor(i);
    }

    public void setStepSize(float f) {
        SliderWithCustomTicks.super.setStepSize(f);
        this.Q1 = true;
    }

    public void setValueFrom(float f) {
        SliderWithCustomTicks.super.setValueFrom(f);
        this.Q1 = true;
    }

    public void setValueTo(float f) {
        SliderWithCustomTicks.super.setValueTo(f);
        this.Q1 = true;
    }
}
