/**
 *
 */
package org.erlide.core.model.erlang.internal;

import org.erlide.core.model.erlang.IErlComment;
import org.erlide.core.model.root.api.IParent;
import org.erlide.core.model.root.api.ISourceRange;
import org.erlide.core.model.root.internal.ErlMember;

/**
 * @author jakob
 * 
 */
public class ErlComment extends ErlMember implements IErlComment {

    private final boolean fIsHeader;

    public ErlComment(final IParent parent, final String name,
            final boolean isHeader) {
        super(parent, name);
        fIsHeader = isHeader;
    }

    public boolean isHeader() {
        return fIsHeader;
    }

    /**
     * @see org.erlide.core.model.root.api.IErlElement#getKind()
     */
    public Kind getKind() {
        return Kind.COMMENT;
    }

    @Override
    public String toString() {
        String result = "<comment";
        if (isHeader()) {
            result = result + ":header";
        }
        return result + ", line=" + (getLineStart() + 1) + ">";
    }

    @Override
    public ISourceRange getNameRange() {
        return null;
    }

    @Override
    public void setNameRange(final int offset, final int length) {
    }
}
