package org.multiverse.api.closures;

import org.multiverse.api.Transaction;

/**
 * An atomic closure tailored for returning a primitive type: int. Using this AtomicIntClosure instead of
 * the {@link AtomicClosure} is that no object wrappers need to be created and there is no reason to deal with a potential
 * null value.
 *
 * @author Peter Veentjer.
 */
public interface AtomicIntClosure{

    /**
     * Executes the closure.
     *
     * @param tx the Transaction. Depending on the transaction {@link org.multiverse.api.PropagationLevel}, this could
     *           be null.
     * @return the result of the execution.
     */
     int execute(Transaction tx)throws Exception;
}