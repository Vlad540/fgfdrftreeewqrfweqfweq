package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ye0  reason: default package */
public final class ye0 {
    public final xe0 a;
    public final xe0 b = new xe0();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public ye0(int i2, int i3, Context context) {
        AttributeSet attributeSet;
        int i4;
        int next;
        xe0 xe0 = new xe0();
        int i5 = xe0.a;
        if (i5 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i5);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                } else if (TextUtils.equals(xml.getName(), "badge")) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    i4 = asAttributeSet.getStyleAttribute();
                    attributeSet = asAttributeSet;
                } else {
                    throw new XmlPullParserException("Must have a <" + "badge" + "> start tag");
                }
            } catch (IOException | XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i5));
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i4 = 0;
        }
        TypedArray d2 = she.d(context, attributeSet, xvb.Badge, i2, i4 == 0 ? i3 : i4, new int[0]);
        Resources resources = context.getResources();
        this.c = (float) d2.getDimensionPixelSize(xvb.Badge_badgeRadius, -1);
        this.i = context.getResources().getDimensionPixelSize(vmb.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(vmb.mtrl_badge_text_horizontal_edge_offset);
        this.d = (float) d2.getDimensionPixelSize(xvb.Badge_badgeWithTextRadius, -1);
        this.e = d2.getDimension(xvb.Badge_badgeWidth, resources.getDimension(vmb.m3_badge_size));
        this.g = d2.getDimension(xvb.Badge_badgeWithTextWidth, resources.getDimension(vmb.m3_badge_with_text_size));
        this.f = d2.getDimension(xvb.Badge_badgeHeight, resources.getDimension(vmb.m3_badge_size));
        this.h = d2.getDimension(xvb.Badge_badgeWithTextHeight, resources.getDimension(vmb.m3_badge_with_text_size));
        this.k = d2.getInt(xvb.Badge_offsetAlignmentMode, 1);
        xe0 xe02 = this.b;
        int i6 = xe0.x0;
        xe02.x0 = i6 == -2 ? 255 : i6;
        int i7 = xe0.z0;
        if (i7 != -2) {
            xe02.z0 = i7;
        } else if (d2.hasValue(xvb.Badge_number)) {
            this.b.z0 = d2.getInt(xvb.Badge_number, 0);
        } else {
            this.b.z0 = -1;
        }
        String str = xe0.y0;
        if (str != null) {
            this.b.y0 = str;
        } else if (d2.hasValue(xvb.Badge_badgeText)) {
            this.b.y0 = d2.getString(xvb.Badge_badgeText);
        }
        xe0 xe03 = this.b;
        xe03.D0 = xe0.D0;
        CharSequence charSequence = xe0.E0;
        xe03.E0 = charSequence == null ? context.getString(wsb.mtrl_badge_numberless_content_description) : charSequence;
        xe0 xe04 = this.b;
        int i8 = xe0.F0;
        xe04.F0 = i8 == 0 ? qsb.mtrl_badge_content_description : i8;
        int i9 = xe0.G0;
        xe04.G0 = i9 == 0 ? wsb.mtrl_exceed_max_badge_number_content_description : i9;
        Boolean bool = xe0.I0;
        xe04.I0 = Boolean.valueOf(bool == null || bool.booleanValue());
        xe0 xe05 = this.b;
        int i10 = xe0.A0;
        xe05.A0 = i10 == -2 ? d2.getInt(xvb.Badge_maxCharacterCount, -2) : i10;
        xe0 xe06 = this.b;
        int i11 = xe0.B0;
        xe06.B0 = i11 == -2 ? d2.getInt(xvb.Badge_maxNumber, -2) : i11;
        xe0 xe07 = this.b;
        Integer num = xe0.X;
        xe07.X = Integer.valueOf(num == null ? d2.getResourceId(xvb.Badge_badgeShapeAppearance, kvb.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        xe0 xe08 = this.b;
        Integer num2 = xe0.Y;
        xe08.Y = Integer.valueOf(num2 == null ? d2.getResourceId(xvb.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        xe0 xe09 = this.b;
        Integer num3 = xe0.Z;
        xe09.Z = Integer.valueOf(num3 == null ? d2.getResourceId(xvb.Badge_badgeWithTextShapeAppearance, kvb.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        xe0 xe010 = this.b;
        Integer num4 = xe0.w0;
        xe010.w0 = Integer.valueOf(num4 == null ? d2.getResourceId(xvb.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        xe0 xe011 = this.b;
        Integer num5 = xe0.b;
        xe011.b = Integer.valueOf(num5 == null ? wx3.i(context, d2, xvb.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        xe0 xe012 = this.b;
        Integer num6 = xe0.o;
        xe012.o = Integer.valueOf(num6 == null ? d2.getResourceId(xvb.Badge_badgeTextAppearance, kvb.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = xe0.c;
        if (num7 != null) {
            this.b.c = num7;
        } else if (d2.hasValue(xvb.Badge_badgeTextColor)) {
            this.b.c = Integer.valueOf(wx3.i(context, d2, xvb.Badge_badgeTextColor).getDefaultColor());
        } else {
            int intValue = this.b.o.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, xvb.TextAppearance);
            obtainStyledAttributes.getDimension(xvb.TextAppearance_android_textSize, 0.0f);
            ColorStateList i12 = wx3.i(context, obtainStyledAttributes, xvb.TextAppearance_android_textColor);
            wx3.i(context, obtainStyledAttributes, xvb.TextAppearance_android_textColorHint);
            wx3.i(context, obtainStyledAttributes, xvb.TextAppearance_android_textColorLink);
            obtainStyledAttributes.getInt(xvb.TextAppearance_android_textStyle, 0);
            obtainStyledAttributes.getInt(xvb.TextAppearance_android_typeface, 1);
            int i13 = xvb.TextAppearance_fontFamily;
            i13 = !obtainStyledAttributes.hasValue(i13) ? xvb.TextAppearance_android_fontFamily : i13;
            obtainStyledAttributes.getResourceId(i13, 0);
            obtainStyledAttributes.getString(i13);
            obtainStyledAttributes.getBoolean(xvb.TextAppearance_textAllCaps, false);
            wx3.i(context, obtainStyledAttributes, xvb.TextAppearance_android_shadowColor);
            obtainStyledAttributes.getFloat(xvb.TextAppearance_android_shadowDx, 0.0f);
            obtainStyledAttributes.getFloat(xvb.TextAppearance_android_shadowDy, 0.0f);
            obtainStyledAttributes.getFloat(xvb.TextAppearance_android_shadowRadius, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, xvb.MaterialTextAppearance);
            obtainStyledAttributes2.hasValue(xvb.MaterialTextAppearance_android_letterSpacing);
            obtainStyledAttributes2.getFloat(xvb.MaterialTextAppearance_android_letterSpacing, 0.0f);
            obtainStyledAttributes2.recycle();
            this.b.c = Integer.valueOf(i12.getDefaultColor());
        }
        xe0 xe013 = this.b;
        Integer num8 = xe0.H0;
        xe013.H0 = Integer.valueOf(num8 == null ? d2.getInt(xvb.Badge_badgeGravity, 8388661) : num8.intValue());
        xe0 xe014 = this.b;
        Integer num9 = xe0.J0;
        xe014.J0 = Integer.valueOf(num9 == null ? d2.getDimensionPixelSize(xvb.Badge_badgeWidePadding, resources.getDimensionPixelSize(vmb.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        xe0 xe015 = this.b;
        Integer num10 = xe0.K0;
        xe015.K0 = Integer.valueOf(num10 == null ? d2.getDimensionPixelSize(xvb.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(vmb.m3_badge_with_text_vertical_padding)) : num10.intValue());
        xe0 xe016 = this.b;
        Integer num11 = xe0.L0;
        xe016.L0 = Integer.valueOf(num11 == null ? d2.getDimensionPixelOffset(xvb.Badge_horizontalOffset, 0) : num11.intValue());
        xe0 xe017 = this.b;
        Integer num12 = xe0.M0;
        xe017.M0 = Integer.valueOf(num12 == null ? d2.getDimensionPixelOffset(xvb.Badge_verticalOffset, 0) : num12.intValue());
        xe0 xe018 = this.b;
        Integer num13 = xe0.N0;
        xe018.N0 = Integer.valueOf(num13 == null ? d2.getDimensionPixelOffset(xvb.Badge_horizontalOffsetWithText, xe018.L0.intValue()) : num13.intValue());
        xe0 xe019 = this.b;
        Integer num14 = xe0.O0;
        xe019.O0 = Integer.valueOf(num14 == null ? d2.getDimensionPixelOffset(xvb.Badge_verticalOffsetWithText, xe019.M0.intValue()) : num14.intValue());
        xe0 xe020 = this.b;
        Integer num15 = xe0.R0;
        xe020.R0 = Integer.valueOf(num15 == null ? d2.getDimensionPixelOffset(xvb.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        xe0 xe021 = this.b;
        Integer num16 = xe0.P0;
        xe021.P0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        xe0 xe022 = this.b;
        Integer num17 = xe0.Q0;
        xe022.Q0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        xe0 xe023 = this.b;
        Boolean bool2 = xe0.S0;
        xe023.S0 = Boolean.valueOf(bool2 == null ? d2.getBoolean(xvb.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        d2.recycle();
        Locale locale = xe0.C0;
        if (locale == null) {
            this.b.C0 = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.C0 = locale;
        }
        this.a = xe0;
    }
}
