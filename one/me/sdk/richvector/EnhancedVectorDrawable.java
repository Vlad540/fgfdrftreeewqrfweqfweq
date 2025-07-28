package one.me.sdk.richvector;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import one.me.sdk.richvector.internal.element.Shape;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001SB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u00102J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0011H\u0016¢\u0006\u0004\b=\u0010\u0013J\u0019\u0010A\u001a\u0004\u0018\u00010>2\u0006\u00109\u001a\u000208H\u0000¢\u0006\u0004\b?\u0010@J\r\u0010B\u001a\u00020\u0016¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u0014\u0010F\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010DR\u0016\u0010I\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010DR\u0016\u0010J\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010DR\u0016\u0010K\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010DR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010P\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lone/me/sdk/richvector/EnhancedVectorDrawable;", "Landroid/graphics/drawable/Drawable;", "Ls0f;", "Landroid/content/Context;", "context", "", "resId", "<init>", "(Landroid/content/Context;I)V", "Landroid/content/res/Resources;", "resources", "(Landroid/content/res/Resources;I)V", "prototype", "(Lone/me/sdk/richvector/EnhancedVectorDrawable;)V", "Lone/me/sdk/richvector/internal/element/Shape;", "buildShape", "(I)Lone/me/sdk/richvector/internal/element/Shape;", "Ljue;", "buildScaleMatrix", "()V", "scaleAllPaths", "scaleAllStrokes", "", "value", "dp", "(F)I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "(I)V", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/drawable/Drawable$ConstantState;", "getConstantState", "()Landroid/graphics/drawable/Drawable$ConstantState;", "", "name", "Lone/me/sdk/richvector/VectorPath;", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/VectorPath;", "invalidatePath", "Lone/me/sdk/richvector/AnimationTarget;", "findTarget$rich_vector_release", "(Ljava/lang/String;)Lone/me/sdk/richvector/AnimationTarget;", "findTarget", "getPixelSize", "()F", "I", "Landroid/content/res/Resources;", "shape", "Lone/me/sdk/richvector/internal/element/Shape;", "left", "top", "width", "height", "scaleRatio", "F", "strokeRatio", "Landroid/graphics/Matrix;", "scaleMatrix", "Landroid/graphics/Matrix;", "Companion", "az4", "rich-vector_release"}, k = 1, mv = {2, 0, 0})
@Keep
public class EnhancedVectorDrawable extends Drawable implements s0f {
    private static final az4 Companion = new Object();
    /* access modifiers changed from: private */
    public static final String TAG = "EnhancedVectorDrawable";
    private int height;
    private int left;
    /* access modifiers changed from: private */
    public final int resId;
    /* access modifiers changed from: private */
    public final Resources resources;
    private final Matrix scaleMatrix;
    private float scaleRatio;
    private final Shape shape;
    private float strokeRatio;
    private int top;
    private int width;

    public EnhancedVectorDrawable(Context context, int i) {
        this(context.getResources(), i);
    }

    private final void buildScaleMatrix() {
        Matrix matrix = this.scaleMatrix;
        matrix.reset();
        matrix.postTranslate((((float) this.width) / 2.0f) - (this.shape.getViewportWidth() / 2.0f), (((float) this.height) / 2.0f) - (this.shape.getViewportHeight() / 2.0f));
        float min = Math.min(((float) this.width) / this.shape.getViewportWidth(), ((float) this.height) / this.shape.getViewportHeight());
        this.scaleRatio = min;
        matrix.postScale(min, min, ((float) this.width) / 2.0f, ((float) this.height) / 2.0f);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, k03] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, k03] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, k03] */
    /* JADX WARNING: type inference failed for: r7v7, types: [java.lang.Object, k03] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:94:0x0195=Splitter:B:94:0x0195, B:90:0x018b=Splitter:B:90:0x018b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final one.me.sdk.richvector.internal.element.Shape buildShape(int r20) throws android.content.res.Resources.NotFoundException {
        /*
            r19 = this;
            q0f r0 = new q0f
            r0 = r19
            android.content.res.Resources r0 = r0.resources
            lv1 r1 = defpackage.q0f.a
            java.lang.Object r2 = r1.b
            android.util.LruCache r2 = (android.util.LruCache) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Object r2 = r2.get(r3)
            one.me.sdk.richvector.internal.element.Shape r2 = (one.me.sdk.richvector.internal.element.Shape) r2
            if (r2 == 0) goto L_0x001f
            one.me.sdk.richvector.internal.element.Shape r0 = new one.me.sdk.richvector.internal.element.Shape
            r0.<init>(r2)
            goto L_0x01a9
        L_0x001f:
            r2 = r20
            android.content.res.XmlResourceParser r3 = r0.getXml(r2)
            k03 r0 = new k03
            r0.<init>()
            k03 r4 = new k03
            r4.<init>()
            k03 r5 = new k03
            r5.<init>()
            one.me.sdk.richvector.internal.element.Shape r16 = new one.me.sdk.richvector.internal.element.Shape
            r14 = 64
            r15 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.util.Stack r6 = new java.util.Stack
            r6.<init>()
            int r7 = r3.getEventType()     // Catch:{ XmlPullParserException -> 0x0194, IOException -> 0x018a }
            r9 = r16
            r10 = 0
            r11 = 0
        L_0x0052:
            r12 = 1
            if (r7 == r12) goto L_0x0186
            java.lang.String r13 = r3.getName()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r14 = 4
            r15 = 3
            r8 = 2
            r12 = -1
            if (r7 == r8) goto L_0x0126
            if (r7 == r15) goto L_0x0063
            goto L_0x0180
        L_0x0063:
            int[] r7 = hr1.w(r14)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            int r14 = r7.length     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r15 = 0
        L_0x0069:
            if (r15 >= r14) goto L_0x007e
            r18 = r7[r15]     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            java.lang.String r8 = defpackage.sxe.h(r18)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            boolean r8 = r8.equals(r13)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            if (r8 == 0) goto L_0x007a
            r15 = r18
            goto L_0x007f
        L_0x007a:
            int r15 = r15 + 1
            r8 = 2
            goto L_0x0069
        L_0x007e:
            r15 = 0
        L_0x007f:
            if (r15 != 0) goto L_0x0083
            r7 = r12
            goto L_0x008b
        L_0x0083:
            int[] r7 = defpackage.p0f.$EnumSwitchMapping$0     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            int r8 = hr1.t(r15)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r7 = r7[r8]     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
        L_0x008b:
            if (r7 == r12) goto L_0x0180
            r8 = 1
            if (r7 == r8) goto L_0x0121
            r8 = 2
            if (r7 == r8) goto L_0x00f8
            java.lang.String r8 = "Required value was null."
            r12 = 3
            if (r7 == r12) goto L_0x00d0
            r12 = 4
            if (r7 != r12) goto L_0x00ca
            if (r11 == 0) goto L_0x00c0
            boolean r7 = r6.isEmpty()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            if (r7 == 0) goto L_0x00b5
            r9.addClipPath(r11)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0180
        L_0x00a8:
            r0 = move-exception
            goto L_0x01aa
        L_0x00ab:
            r0 = move-exception
            r16 = r9
            goto L_0x018b
        L_0x00b0:
            r0 = move-exception
            r16 = r9
            goto L_0x0195
        L_0x00b5:
            java.lang.Object r7 = r6.peek()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            one.me.sdk.richvector.internal.element.GroupElement r7 = (one.me.sdk.richvector.internal.element.GroupElement) r7     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r7.addClipPath(r11)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0180
        L_0x00c0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            java.lang.String r4 = r8.toString()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r0.<init>(r4)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            throw r0     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
        L_0x00ca:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            throw r0     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
        L_0x00d0:
            if (r10 == 0) goto L_0x00ee
            boolean r7 = r6.isEmpty()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            if (r7 == 0) goto L_0x00dc
            r9.addPath(r10)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x00e5
        L_0x00dc:
            java.lang.Object r7 = r6.peek()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            one.me.sdk.richvector.internal.element.GroupElement r7 = (one.me.sdk.richvector.internal.element.GroupElement) r7     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r7.addPath(r10)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
        L_0x00e5:
            android.graphics.Path r7 = r10.getPath()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r9.appendToFullPath(r7)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0180
        L_0x00ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            java.lang.String r4 = r8.toString()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r0.<init>(r4)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            throw r0     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
        L_0x00f8:
            java.lang.Object r7 = r6.pop()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            one.me.sdk.richvector.internal.element.GroupElement r7 = (one.me.sdk.richvector.internal.element.GroupElement) r7     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            boolean r8 = r6.isEmpty()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            if (r8 == 0) goto L_0x010d
            r8 = 0
            r7.setParent(r8)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r9.addGroup(r7)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0180
        L_0x010d:
            r8 = 0
            java.lang.Object r12 = r6.peek()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            one.me.sdk.richvector.internal.element.GroupElement r12 = (one.me.sdk.richvector.internal.element.GroupElement) r12     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r7.setParent(r12)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            java.lang.Object r12 = r6.peek()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            one.me.sdk.richvector.internal.element.GroupElement r12 = (one.me.sdk.richvector.internal.element.GroupElement) r12     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r12.addGroup(r7)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0180
        L_0x0121:
            r8 = 0
            r9.buildTransformMatrices()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0180
        L_0x0126:
            r7 = r14
            r8 = 0
            int[] r14 = hr1.w(r7)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            int r7 = r14.length     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r15 = 0
        L_0x012e:
            if (r15 >= r7) goto L_0x0143
            r17 = r14[r15]     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            java.lang.String r8 = defpackage.sxe.h(r17)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            boolean r8 = r8.equals(r13)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            if (r8 == 0) goto L_0x013f
            r15 = r17
            goto L_0x0144
        L_0x013f:
            int r15 = r15 + 1
            r8 = 0
            goto L_0x012e
        L_0x0143:
            r15 = 0
        L_0x0144:
            if (r15 != 0) goto L_0x0148
            r7 = r12
            goto L_0x0150
        L_0x0148:
            int[] r7 = defpackage.p0f.$EnumSwitchMapping$0     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            int r8 = hr1.t(r15)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r7 = r7[r8]     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
        L_0x0150:
            if (r7 == r12) goto L_0x0180
            r8 = 1
            if (r7 == r8) goto L_0x0176
            r8 = 2
            if (r7 == r8) goto L_0x016e
            r8 = 3
            if (r7 == r8) goto L_0x0169
            r8 = 4
            if (r7 != r8) goto L_0x0163
            one.me.sdk.richvector.internal.element.ClipPathElement r11 = r5.n0(r3)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0180
        L_0x0163:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            throw r0     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
        L_0x0169:
            one.me.sdk.richvector.internal.element.PathElement r10 = r4.p0(r3)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0180
        L_0x016e:
            one.me.sdk.richvector.internal.element.GroupElement r7 = r0.o0(r3)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r6.push(r7)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0180
        L_0x0176:
            k03 r7 = new k03     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            one.me.sdk.richvector.internal.element.Shape r7 = r7.q0(r3)     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            r9 = r7
        L_0x0180:
            int r7 = r3.next()     // Catch:{ XmlPullParserException -> 0x00b0, IOException -> 0x00ab }
            goto L_0x0052
        L_0x0186:
            r3.close()
            goto L_0x0199
        L_0x018a:
            r0 = move-exception
        L_0x018b:
            r0.printStackTrace()     // Catch:{ all -> 0x00a8 }
        L_0x018e:
            r3.close()
            r9 = r16
            goto L_0x0199
        L_0x0194:
            r0 = move-exception
        L_0x0195:
            r0.printStackTrace()     // Catch:{ all -> 0x00a8 }
            goto L_0x018e
        L_0x0199:
            java.lang.Object r0 = r1.b
            android.util.LruCache r0 = (android.util.LruCache) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0.put(r1, r9)
            one.me.sdk.richvector.internal.element.Shape r0 = new one.me.sdk.richvector.internal.element.Shape
            r0.<init>(r9)
        L_0x01a9:
            return r0
        L_0x01aa:
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.richvector.EnhancedVectorDrawable.buildShape(int):one.me.sdk.richvector.internal.element.Shape");
    }

    private final int dp(float f) {
        return (int) (this.resources.getDisplayMetrics().density * f);
    }

    private final void scaleAllPaths() {
        this.shape.scaleAllPaths(this.scaleMatrix);
    }

    private final void scaleAllStrokes() {
        float min = Math.min(((float) this.width) / this.shape.getWidth(), ((float) this.height) / this.shape.getHeight());
        this.strokeRatio = min;
        this.shape.scaleAllStrokeWidth(min);
    }

    public void draw(Canvas canvas) {
        setAlpha(this.shape.getAlpha());
        int i = this.left;
        if (i == 0 && this.top == 0) {
            this.shape.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.translate((float) i, (float) this.top);
        try {
            this.shape.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public VectorPath findPath(String str) {
        return this.shape.findPath(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        r0 = r1.shape.findPath(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final one.me.sdk.richvector.AnimationTarget findTarget$rich_vector_release(java.lang.String r2) {
        /*
            r1 = this;
            one.me.sdk.richvector.internal.element.Shape r0 = r1.shape
            java.lang.String r0 = r0.getName()
            boolean r0 = hhd.f(r0, r2)
            if (r0 == 0) goto L_0x000f
            one.me.sdk.richvector.internal.element.Shape r1 = r1.shape
            goto L_0x0028
        L_0x000f:
            one.me.sdk.richvector.internal.element.Shape r0 = r1.shape
            one.me.sdk.richvector.internal.element.GroupElement r0 = r0.findGroup(r2)
            if (r0 == 0) goto L_0x0019
        L_0x0017:
            r1 = r0
            goto L_0x0028
        L_0x0019:
            one.me.sdk.richvector.internal.element.Shape r0 = r1.shape
            one.me.sdk.richvector.internal.element.PathElement r0 = r0.findPath(r2)
            if (r0 == 0) goto L_0x0022
            goto L_0x0017
        L_0x0022:
            one.me.sdk.richvector.internal.element.Shape r1 = r1.shape
            one.me.sdk.richvector.internal.element.ClipPathElement r1 = r1.findClipPath(r2)
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.richvector.EnhancedVectorDrawable.findTarget$rich_vector_release(java.lang.String):one.me.sdk.richvector.AnimationTarget");
    }

    public Drawable.ConstantState getConstantState() {
        return new rf(this);
    }

    public int getIntrinsicHeight() {
        return dp(this.shape.getHeight());
    }

    public int getIntrinsicWidth() {
        return dp(this.shape.getWidth());
    }

    public int getOpacity() {
        return -3;
    }

    public final float getPixelSize() {
        if (this.shape.getWidth() == 0.0f || this.shape.getHeight() == 0.0f || this.shape.getViewportHeight() == 0.0f || this.shape.getViewportWidth() == 0.0f) {
            return 1.0f;
        }
        int dp = dp(this.shape.getWidth());
        int dp2 = dp(this.shape.getHeight());
        return Math.min(this.shape.getViewportWidth() / ((float) dp), this.shape.getViewportHeight() / ((float) dp2));
    }

    public void invalidatePath() {
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect.width() != 0 && rect.height() != 0) {
            this.left = rect.left;
            this.top = rect.top;
            this.width = rect.width();
            this.height = rect.height();
            buildScaleMatrix();
            scaleAllPaths();
            scaleAllStrokes();
        }
    }

    public void setAlpha(int i) {
        this.shape.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setTintList(ColorStateList colorStateList) {
    }

    public void setTintMode(PorterDuff.Mode mode) {
    }

    public EnhancedVectorDrawable(Resources resources2, int i) throws Resources.NotFoundException {
        Shape shape2;
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = resources2;
        this.resId = i;
        if (i != 0) {
            shape2 = buildShape(i);
        } else {
            Shape.Companion.getClass();
            shape2 = Shape.EMPTY;
        }
        this.shape = shape2;
        setBounds(0, 0, dp(shape2.getWidth()), dp(shape2.getHeight()));
    }

    public EnhancedVectorDrawable(EnhancedVectorDrawable enhancedVectorDrawable) {
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = enhancedVectorDrawable.resources;
        this.resId = enhancedVectorDrawable.resId;
        Shape shape2 = new Shape(enhancedVectorDrawable.shape);
        this.shape = shape2;
        setBounds(0, 0, dp(shape2.getWidth()), dp(shape2.getHeight()));
    }
}
