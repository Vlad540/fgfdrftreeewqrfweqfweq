package one.me.sdk.richvector.internal.element;

import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.richvector.AnimationTarget;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010B\u001d\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0000\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0003H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u0010+R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u00101R$\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0016R*\u0010\u0006\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\u001fR*\u0010\u0007\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010:\u001a\u0004\b>\u0010<\"\u0004\b?\u0010\u001fR*\u0010\b\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010\u001fR*\u0010\t\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\t\u0010:\u001a\u0004\bB\u0010<\"\u0004\bC\u0010\u001fR*\u0010\n\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\n\u0010:\u001a\u0004\bD\u0010<\"\u0004\bE\u0010\u001fR*\u0010\u000b\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\bF\u0010<\"\u0004\bG\u0010\u001fR*\u0010\f\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\f\u0010:\u001a\u0004\bH\u0010<\"\u0004\bI\u0010\u001fR\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010JR\u0014\u0010K\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010JR\u0011\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001a0M8\u0016X\u0005R\u0011\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00000M8\u0016X\u0005R\u0011\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00170M8\u0016X\u0005¨\u0006Q"}, d2 = {"Lone/me/sdk/richvector/internal/element/GroupElement;", "Lone/me/sdk/richvector/internal/element/ElementHolder;", "Lone/me/sdk/richvector/AnimationTarget;", "", "name", "", "pivotX", "pivotY", "rotation", "scaleX", "scaleY", "translateX", "translateY", "parent", "elementHolder", "<init>", "(Ljava/lang/String;FFFFFFFLone/me/sdk/richvector/internal/element/GroupElement;Lone/me/sdk/richvector/internal/element/ElementHolder;)V", "prototype", "(Lone/me/sdk/richvector/internal/element/GroupElement;Lone/me/sdk/richvector/internal/element/GroupElement;)V", "element", "Ljue;", "addGroup", "(Lone/me/sdk/richvector/internal/element/GroupElement;)V", "Lone/me/sdk/richvector/internal/element/PathElement;", "addPath", "(Lone/me/sdk/richvector/internal/element/PathElement;)V", "Lone/me/sdk/richvector/internal/element/ClipPathElement;", "addClipPath", "(Lone/me/sdk/richvector/internal/element/ClipPathElement;)V", "ratio", "scaleAllStrokeWidth", "(F)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/PathElement;", "findGroup", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/GroupElement;", "findClipPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/ClipPathElement;", "buildTransformMatrix", "()V", "Landroid/graphics/Matrix;", "scaleMatrix", "scaleAllPaths", "(Landroid/graphics/Matrix;)V", "toString", "()Ljava/lang/String;", "invalidateTransforms", "Ljava/lang/String;", "getName", "Lone/me/sdk/richvector/internal/element/GroupElement;", "getParent", "()Lone/me/sdk/richvector/internal/element/GroupElement;", "setParent", "value", "F", "getPivotX", "()F", "setPivotX", "getPivotY", "setPivotY", "getRotation", "setRotation", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getTranslateX", "setTranslateX", "getTranslateY", "setTranslateY", "Landroid/graphics/Matrix;", "originalTransformMatrix", "finalTransformMatrix", "", "clipPathElements", "groupElements", "pathElements", "rich-vector_release"}, k = 1, mv = {2, 0, 0})
@Keep
public final class GroupElement implements ElementHolder, AnimationTarget {
    private final /* synthetic */ ElementHolder $$delegate_0;
    private final Matrix finalTransformMatrix;
    private final String name;
    private final Matrix originalTransformMatrix;
    private GroupElement parent;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private final Matrix scaleMatrix;
    private float scaleX;
    private float scaleY;
    private float translateX;
    private float translateY;

    public GroupElement(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, GroupElement groupElement, ElementHolder elementHolder) {
        this.$$delegate_0 = elementHolder;
        this.name = str;
        this.parent = groupElement;
        this.pivotX = f;
        this.pivotY = f2;
        this.rotation = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translateX = f6;
        this.translateY = f7;
        this.scaleMatrix = new Matrix();
        this.originalTransformMatrix = new Matrix();
        this.finalTransformMatrix = new Matrix();
    }

    private final void invalidateTransforms() {
        this.finalTransformMatrix.set(this.originalTransformMatrix);
        this.finalTransformMatrix.postConcat(this.scaleMatrix);
        for (GroupElement scaleAllPaths : getGroupElements()) {
            scaleAllPaths.scaleAllPaths(this.scaleMatrix);
        }
        for (PathElement transform : getPathElements()) {
            transform.transform(this.finalTransformMatrix);
        }
        for (ClipPathElement transform2 : getClipPathElements()) {
            transform2.transform(this.finalTransformMatrix);
        }
    }

    public void addClipPath(ClipPathElement clipPathElement) {
        this.$$delegate_0.addClipPath(clipPathElement);
    }

    public void addGroup(GroupElement groupElement) {
        this.$$delegate_0.addGroup(groupElement);
    }

    public void addPath(PathElement pathElement) {
        this.$$delegate_0.addPath(pathElement);
    }

    public final void buildTransformMatrix() {
        Matrix matrix = this.originalTransformMatrix;
        matrix.reset();
        matrix.postScale(this.scaleX, this.scaleY, this.pivotX, this.pivotY);
        matrix.postRotate(this.rotation, this.pivotX, this.pivotY);
        matrix.postTranslate(this.translateX, this.translateY);
        GroupElement groupElement = this.parent;
        if (groupElement != null) {
            this.originalTransformMatrix.postConcat(groupElement.originalTransformMatrix);
        }
        for (GroupElement buildTransformMatrix : getGroupElements()) {
            buildTransformMatrix.buildTransformMatrix();
        }
        invalidateTransforms();
    }

    public void draw(Canvas canvas) {
        this.$$delegate_0.draw(canvas);
    }

    public ClipPathElement findClipPath(String str) {
        return this.$$delegate_0.findClipPath(str);
    }

    public GroupElement findGroup(String str) {
        return this.$$delegate_0.findGroup(str);
    }

    public PathElement findPath(String str) {
        return this.$$delegate_0.findPath(str);
    }

    public List<ClipPathElement> getClipPathElements() {
        return this.$$delegate_0.getClipPathElements();
    }

    public List<GroupElement> getGroupElements() {
        return this.$$delegate_0.getGroupElements();
    }

    public final String getName() {
        return this.name;
    }

    public final GroupElement getParent() {
        return this.parent;
    }

    public List<PathElement> getPathElements() {
        return this.$$delegate_0.getPathElements();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslateX() {
        return this.translateX;
    }

    public final float getTranslateY() {
        return this.translateY;
    }

    public final void scaleAllPaths(Matrix matrix) {
        this.scaleMatrix.set(matrix);
        invalidateTransforms();
    }

    public void scaleAllStrokeWidth(float f) {
        this.$$delegate_0.scaleAllStrokeWidth(f);
    }

    public final void setParent(GroupElement groupElement) {
        this.parent = groupElement;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        buildTransformMatrix();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        buildTransformMatrix();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        buildTransformMatrix();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        buildTransformMatrix();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        buildTransformMatrix();
    }

    public final void setTranslateX(float f) {
        this.translateX = f;
        buildTransformMatrix();
    }

    public final void setTranslateY(float f) {
        this.translateY = f;
        buildTransformMatrix();
    }

    public String toString() {
        String str;
        String str2 = this.name;
        GroupElement groupElement = this.parent;
        if (groupElement != null) {
            str = GroupElement.class.getCanonicalName() + "(name=" + groupElement.name + ")";
        } else {
            str = null;
        }
        float f = this.pivotX;
        float f2 = this.pivotY;
        float f3 = this.rotation;
        float f4 = this.scaleX;
        float f5 = this.scaleY;
        float f6 = this.translateX;
        float f7 = this.translateY;
        Matrix matrix = this.scaleMatrix;
        Matrix matrix2 = this.originalTransformMatrix;
        Matrix matrix3 = this.finalTransformMatrix;
        List<GroupElement> groupElements = getGroupElements();
        List<PathElement> pathElements = getPathElements();
        List<ClipPathElement> clipPathElements = getClipPathElements();
        StringBuilder j = c3d.j("GroupElement(name=", str2, ", parent=", str, ", pivotX=");
        j.append(f);
        j.append(", pivotY=");
        j.append(f2);
        j.append(", rotation=");
        j.append(f3);
        j.append(", scaleX=");
        j.append(f4);
        j.append(", scaleY=");
        j.append(f5);
        j.append(", translateX=");
        j.append(f6);
        j.append(", translateY=");
        j.append(f7);
        j.append(", scaleMatrix=");
        j.append(matrix);
        j.append(", originalTransformMatrix=");
        j.append(matrix2);
        j.append(", finalTransformMatrix=");
        j.append(matrix3);
        j.append(", groupElements=");
        j.append(groupElements);
        j.append(", pathElements=");
        j.append(pathElements);
        j.append(", clipPathElements=");
        return hr1.i(j, clipPathElements, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GroupElement(java.lang.String r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, one.me.sdk.richvector.internal.element.GroupElement r22, one.me.sdk.richvector.internal.element.ElementHolder r23, int r24, x54 r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r11 = r1
            goto L_0x000b
        L_0x0009:
            r11 = r22
        L_0x000b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0016
            one.me.sdk.richvector.internal.element.ElementHolderImpl r0 = new one.me.sdk.richvector.internal.element.ElementHolderImpl
            r0.<init>()
            r12 = r0
            goto L_0x0018
        L_0x0016:
            r12 = r23
        L_0x0018:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.richvector.internal.element.GroupElement.<init>(java.lang.String, float, float, float, float, float, float, float, one.me.sdk.richvector.internal.element.GroupElement, one.me.sdk.richvector.internal.element.ElementHolder, int, x54):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupElement(GroupElement groupElement, GroupElement groupElement2, int i, x54 x54) {
        this(groupElement, (i & 2) != 0 ? null : groupElement2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GroupElement(one.me.sdk.richvector.internal.element.GroupElement r12, one.me.sdk.richvector.internal.element.GroupElement r13) {
        /*
            r11 = this;
            java.lang.String r1 = r12.name
            float r2 = r12.pivotX
            float r3 = r12.pivotY
            float r4 = r12.rotation
            float r5 = r12.scaleX
            float r6 = r12.scaleY
            float r7 = r12.translateX
            float r8 = r12.translateY
            if (r13 != 0) goto L_0x0020
            one.me.sdk.richvector.internal.element.GroupElement r13 = r12.parent
            r0 = 0
            if (r13 == 0) goto L_0x001e
            one.me.sdk.richvector.internal.element.GroupElement r9 = new one.me.sdk.richvector.internal.element.GroupElement
            r10 = 2
            r9.<init>(r13, r0, r10, r0)
            goto L_0x0021
        L_0x001e:
            r9 = r0
            goto L_0x0021
        L_0x0020:
            r9 = r13
        L_0x0021:
            one.me.sdk.richvector.internal.element.ElementHolderImpl r10 = new one.me.sdk.richvector.internal.element.ElementHolderImpl
            r10.<init>()
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            android.graphics.Matrix r13 = r11.scaleMatrix
            android.graphics.Matrix r0 = r12.scaleMatrix
            r13.set(r0)
            android.graphics.Matrix r13 = r11.originalTransformMatrix
            android.graphics.Matrix r0 = r12.originalTransformMatrix
            r13.set(r0)
            android.graphics.Matrix r13 = r11.finalTransformMatrix
            android.graphics.Matrix r0 = r12.finalTransformMatrix
            r13.set(r0)
            java.util.List r13 = r12.getGroupElements()
            java.util.Iterator r13 = r13.iterator()
        L_0x0047:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r13.next()
            one.me.sdk.richvector.internal.element.GroupElement r0 = (one.me.sdk.richvector.internal.element.GroupElement) r0
            java.util.List r1 = r11.getGroupElements()
            ete.e(r1)
            one.me.sdk.richvector.internal.element.GroupElement r2 = new one.me.sdk.richvector.internal.element.GroupElement
            r2.<init>(r0, r11)
            r1.add(r2)
            goto L_0x0047
        L_0x0063:
            java.util.List r13 = r12.getPathElements()
            java.util.Iterator r13 = r13.iterator()
        L_0x006b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r13.next()
            one.me.sdk.richvector.internal.element.PathElement r0 = (one.me.sdk.richvector.internal.element.PathElement) r0
            java.util.List r1 = r11.getPathElements()
            ete.e(r1)
            one.me.sdk.richvector.internal.element.PathElement r2 = new one.me.sdk.richvector.internal.element.PathElement
            r2.<init>(r0)
            r1.add(r2)
            goto L_0x006b
        L_0x0087:
            java.util.List r12 = r12.getClipPathElements()
            java.util.Iterator r12 = r12.iterator()
        L_0x008f:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00ab
            java.lang.Object r13 = r12.next()
            one.me.sdk.richvector.internal.element.ClipPathElement r13 = (one.me.sdk.richvector.internal.element.ClipPathElement) r13
            java.util.List r0 = r11.getClipPathElements()
            ete.e(r0)
            one.me.sdk.richvector.internal.element.ClipPathElement r1 = new one.me.sdk.richvector.internal.element.ClipPathElement
            r1.<init>(r13)
            r0.add(r1)
            goto L_0x008f
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.richvector.internal.element.GroupElement.<init>(one.me.sdk.richvector.internal.element.GroupElement, one.me.sdk.richvector.internal.element.GroupElement):void");
    }
}
