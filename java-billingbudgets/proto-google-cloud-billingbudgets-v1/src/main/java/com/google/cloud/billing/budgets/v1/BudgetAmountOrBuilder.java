/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/budgets/v1/budget_model.proto

package com.google.cloud.billing.budgets.v1;

public interface BudgetAmountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1.BudgetAmount)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A specified amount to use as the budget.
   * `currency_code` is optional. If specified when creating a budget, it must
   * match the currency of the billing account. If specified when updating a
   * budget, it must match the currency_code of the existing budget.
   * The `currency_code` is provided on output.
   * </pre>
   *
   * <code>.google.type.Money specified_amount = 1;</code>
   *
   * @return Whether the specifiedAmount field is set.
   */
  boolean hasSpecifiedAmount();
  /**
   *
   *
   * <pre>
   * A specified amount to use as the budget.
   * `currency_code` is optional. If specified when creating a budget, it must
   * match the currency of the billing account. If specified when updating a
   * budget, it must match the currency_code of the existing budget.
   * The `currency_code` is provided on output.
   * </pre>
   *
   * <code>.google.type.Money specified_amount = 1;</code>
   *
   * @return The specifiedAmount.
   */
  com.google.type.Money getSpecifiedAmount();
  /**
   *
   *
   * <pre>
   * A specified amount to use as the budget.
   * `currency_code` is optional. If specified when creating a budget, it must
   * match the currency of the billing account. If specified when updating a
   * budget, it must match the currency_code of the existing budget.
   * The `currency_code` is provided on output.
   * </pre>
   *
   * <code>.google.type.Money specified_amount = 1;</code>
   */
  com.google.type.MoneyOrBuilder getSpecifiedAmountOrBuilder();

  /**
   *
   *
   * <pre>
   * Use the last period's actual spend as the budget for the present period.
   * LastPeriodAmount can only be set when the budget's time period is a
   * [Filter.calendar_period][google.cloud.billing.budgets.v1.Filter.calendar_period].
   * It cannot be set in combination with
   * [Filter.custom_period][google.cloud.billing.budgets.v1.Filter.custom_period].
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.LastPeriodAmount last_period_amount = 2;</code>
   *
   * @return Whether the lastPeriodAmount field is set.
   */
  boolean hasLastPeriodAmount();
  /**
   *
   *
   * <pre>
   * Use the last period's actual spend as the budget for the present period.
   * LastPeriodAmount can only be set when the budget's time period is a
   * [Filter.calendar_period][google.cloud.billing.budgets.v1.Filter.calendar_period].
   * It cannot be set in combination with
   * [Filter.custom_period][google.cloud.billing.budgets.v1.Filter.custom_period].
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.LastPeriodAmount last_period_amount = 2;</code>
   *
   * @return The lastPeriodAmount.
   */
  com.google.cloud.billing.budgets.v1.LastPeriodAmount getLastPeriodAmount();
  /**
   *
   *
   * <pre>
   * Use the last period's actual spend as the budget for the present period.
   * LastPeriodAmount can only be set when the budget's time period is a
   * [Filter.calendar_period][google.cloud.billing.budgets.v1.Filter.calendar_period].
   * It cannot be set in combination with
   * [Filter.custom_period][google.cloud.billing.budgets.v1.Filter.custom_period].
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.LastPeriodAmount last_period_amount = 2;</code>
   */
  com.google.cloud.billing.budgets.v1.LastPeriodAmountOrBuilder getLastPeriodAmountOrBuilder();

  com.google.cloud.billing.budgets.v1.BudgetAmount.BudgetAmountCase getBudgetAmountCase();
}
