/*
 * Copyright (c) 2017 Memorial Sloan-Kettering Cancer Center.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 * documentation provided hereunder is on an "as is" basis, and
 * Memorial Sloan-Kettering Cancer Center
 * has no obligations to provide maintenance, support,
 * updates, enhancements or modifications.  In no event shall
 * Memorial Sloan-Kettering Cancer Center
 * be liable to any party for direct, indirect, special,
 * incidental or consequential damages, including lost profits, arising
 * out of the use of this software and its documentation, even if
 * Memorial Sloan-Kettering Cancer Center
 * has been advised of the possibility of such damage.
*/

package org.mskcc.oncotree.topbraid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Manda Wilson
 **/
public class TopBraidException extends RuntimeException {

    private static final Logger logger = LoggerFactory.getLogger(TopBraidException.class);

    public TopBraidException(String message) {
        super(message);
        logger.error(message + ": (Check that authentication is working)");
    }

    public TopBraidException(String message, Throwable cause) {
        super(message, cause);
        logger.error(message + ": " + cause + " (Check that authentication is working)");
    }
}
