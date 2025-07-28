package one.me.sdk.richvector.internal.element;

import android.graphics.Canvas;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0!8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0!8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%¨\u0006*"}, d2 = {"Lone/me/sdk/richvector/internal/element/ElementHolderImpl;", "Lone/me/sdk/richvector/internal/element/ElementHolder;", "<init>", "()V", "prototype", "(Lone/me/sdk/richvector/internal/element/ElementHolder;)V", "Lone/me/sdk/richvector/internal/element/GroupElement;", "element", "Ljue;", "addGroup", "(Lone/me/sdk/richvector/internal/element/GroupElement;)V", "Lone/me/sdk/richvector/internal/element/PathElement;", "addPath", "(Lone/me/sdk/richvector/internal/element/PathElement;)V", "Lone/me/sdk/richvector/internal/element/ClipPathElement;", "addClipPath", "(Lone/me/sdk/richvector/internal/element/ClipPathElement;)V", "", "ratio", "scaleAllStrokeWidth", "(F)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "name", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/PathElement;", "findGroup", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/GroupElement;", "findClipPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/ClipPathElement;", "", "groupElements", "Ljava/util/List;", "getGroupElements", "()Ljava/util/List;", "pathElements", "getPathElements", "clipPathElements", "getClipPathElements", "rich-vector_release"}, k = 1, mv = {2, 0, 0})
@Keep
public final class ElementHolderImpl implements ElementHolder {
    private final List<ClipPathElement> clipPathElements;
    private final List<GroupElement> groupElements;
    private final List<PathElement> pathElements;

    public ElementHolderImpl() {
        this.groupElements = new ArrayList();
        this.pathElements = new ArrayList();
        this.clipPathElements = new ArrayList();
    }

    public void addClipPath(ClipPathElement clipPathElement) {
        getClipPathElements().add(clipPathElement);
    }

    public void addGroup(GroupElement groupElement) {
        getGroupElements().add(groupElement);
    }

    public void addPath(PathElement pathElement) {
        getPathElements().add(pathElement);
    }

    public void draw(Canvas canvas) {
        for (ClipPathElement path : getClipPathElements()) {
            canvas.clipPath(path.getPath());
        }
        for (GroupElement draw : getGroupElements()) {
            draw.draw(canvas);
        }
        for (PathElement draw2 : getPathElements()) {
            draw2.draw(canvas);
        }
    }

    public ClipPathElement findClipPath(String str) {
        T t;
        Iterator<T> it = getClipPathElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (hhd.f(((ClipPathElement) t).getName(), str)) {
                break;
            }
        }
        ClipPathElement clipPathElement = (ClipPathElement) t;
        if (clipPathElement != null) {
            return clipPathElement;
        }
        for (GroupElement findClipPath : getGroupElements()) {
            ClipPathElement findClipPath2 = findClipPath.findClipPath(str);
            if (findClipPath2 != null) {
                return findClipPath2;
            }
        }
        return null;
    }

    public GroupElement findGroup(String str) {
        T t;
        Iterator<T> it = getGroupElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (hhd.f(((GroupElement) t).getName(), str)) {
                break;
            }
        }
        GroupElement groupElement = (GroupElement) t;
        if (groupElement != null) {
            return groupElement;
        }
        for (GroupElement findGroup : getGroupElements()) {
            GroupElement findGroup2 = findGroup.findGroup(str);
            if (findGroup2 != null) {
                return findGroup2;
            }
        }
        return null;
    }

    public PathElement findPath(String str) {
        T t;
        Iterator<T> it = getPathElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (hhd.f(((PathElement) t).getName(), str)) {
                break;
            }
        }
        PathElement pathElement = (PathElement) t;
        if (pathElement != null) {
            return pathElement;
        }
        for (GroupElement findPath : getGroupElements()) {
            PathElement findPath2 = findPath.findPath(str);
            if (findPath2 != null) {
                return findPath2;
            }
        }
        return null;
    }

    public List<ClipPathElement> getClipPathElements() {
        return this.clipPathElements;
    }

    public List<GroupElement> getGroupElements() {
        return this.groupElements;
    }

    public List<PathElement> getPathElements() {
        return this.pathElements;
    }

    public void scaleAllStrokeWidth(float f) {
        for (GroupElement scaleAllStrokeWidth : getGroupElements()) {
            scaleAllStrokeWidth.scaleAllStrokeWidth(f);
        }
        for (PathElement strokeRatio : getPathElements()) {
            strokeRatio.setStrokeRatio(f);
        }
    }

    public ElementHolderImpl(ElementHolder elementHolder) {
        this();
        for (GroupElement groupElement : elementHolder.getGroupElements()) {
            getGroupElements().add(new GroupElement(groupElement, (GroupElement) null, 2, (x54) null));
        }
        for (PathElement pathElement : elementHolder.getPathElements()) {
            getPathElements().add(new PathElement(pathElement));
        }
        for (ClipPathElement clipPathElement : elementHolder.getClipPathElements()) {
            getClipPathElements().add(new ClipPathElement(clipPathElement));
        }
    }
}
