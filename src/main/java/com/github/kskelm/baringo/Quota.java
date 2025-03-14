/**
 * This file is released under the Apache License 2.0. See the LICENSE file for details.
 **/
package com.github.kskelm.baringo;

import com.github.kskelm.baringo.util.Utils;

import java.util.Date;

/**
 *
 *
 * Provides insight into quota status for a given
 * client account.
 *
 * See <a href="http://api.imgur.com/#limits">Imgur documentation</a>
 *
 *  @author Kevin Kelm (triggur@gmail.com)
 */
public class Quota {


    private int userCreditsAllocated;
    private int userCreditsAvailable;
    private Date userCreditResetDate;
    private int applicationCreditsAllocated;
    private int applicationCreditsAvailable;
    private int postCreditsAllocated;
    private int postCreditsAvailable;
    private Date postCreditResetDate;

    /**
     * The number of credits allocated to this IP address per hour
     * @return the userCreditsAllocated
     */
    public int getUserCreditsAllocated() {
        return userCreditsAllocated;
    }

    // ================================================

    /**
     * @param userCreditsAllocated the userCreditsAllocated to set
     */
    protected void setUserCreditsAllocated(int userCreditsAllocated) {
        this.userCreditsAllocated = userCreditsAllocated;
    }

    /**
     * The number of credits left to this IP address this hour
     * @return the userCreditsAvailable
     */
    public int getUserCreditsAvailable() {
        return userCreditsAvailable;
    }

    /**
     * @param userCreditsAvailable the userCreditsAvailable to set
     */
    protected void setUserCreditsAvailable(int userCreditsAvailable) {
        this.userCreditsAvailable = userCreditsAvailable;
    }

    /**
     * The date/time that the this IP address's credits will be reset
     * @return the userCreditResetDate
     */
    public Date getUserCreditResetDate() {
        return userCreditResetDate;
    }

    /**
     * @param userCreditResetDate the userCreditResetDate to set
     */
    protected void setUserCreditResetDate(Date userCreditResetDate) {
        this.userCreditResetDate = userCreditResetDate;
    }

    /**
     * The number of credits this registered client is allowed per day
     * @return the applicationCreditsAllocated
     */
    public int getApplicationCreditsAllocated() {
        return applicationCreditsAllocated;
    }

    /**
     * @param applicationCreditsAllocated the applicationCreditsAllocated to set
     */
    protected void setApplicationCreditsAllocated(int applicationCreditsAllocated) {
        this.applicationCreditsAllocated = applicationCreditsAllocated;
    }

    /**
     * The number of remaining credits this registered client has left today
     * @return the applicationCreditsAvailable
     */
    public int getApplicationCreditsAvailable() {
        return applicationCreditsAvailable;
    }

    /**
     * @param applicationCreditsAvailable the applicationCreditsAvailable to set
     */
    protected void setApplicationCreditsAvailable(int applicationCreditsAvailable) {
        this.applicationCreditsAvailable = applicationCreditsAvailable;
    }

    /**
     * Across all usage of this registered client, the number of post credits
     * allocated to this client per hour.  Pro clients get more.
     * This value is set only after a POST call is returned
     * @return the postCreditsAllocated
     */
    public int getPostCreditsAllocated() {
        return postCreditsAllocated;
    }

    /**
     * @param postCreditsAllocated the postCreditsAllocated to set
     */
    protected void setPostCreditsAllocated(int postCreditsAllocated) {
        this.postCreditsAllocated = postCreditsAllocated;
    }

    /**
     * Across all usage of this registered client, the number of post credits
     * left this hour.
     * This value is set only after a POST call is returned.
     * @return the postCreditsAvailable
     */
    public int getPostCreditsAvailable() {
        return postCreditsAvailable;
    }

    /**
     * @param postCreditsAvailable the postCreditsAvailable to set
     */
    protected void setPostCreditsAvailable(int postCreditsAvailable) {
        this.postCreditsAvailable = postCreditsAvailable;
    }

    /**
     * The date/time that the post credit limit will be reset.
     * This value is set only after a POST call is returned.
     * @return the postCreditReset
     */
    public Date getPostCreditResetDate() {
        return postCreditResetDate;
    }

    /**
     * @param postCreditResetDate the postCreditResetDate to set
     */
    protected void setPostCreditResetDate(Date postCreditResetDate) {
        this.postCreditResetDate = postCreditResetDate;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    } // toString
} // Quota
