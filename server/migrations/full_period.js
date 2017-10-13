exports.up = (knex) => {
  return knex.schema.createTableIfNotExists('full_period', (table) => {
    table.increments('id').primary();
    table.string('month');
    table.integer('numberOfDays');
    table.float('firstIndoorUsage');
    table.float('firstOutdoorUsage');
    table.float('secondIndoorUsage');
    table.float('secondOutdoorUsage');
    table.integer('totalBillingPeriod');
  });
};

exports.down = (knex) => {
  return knex.schema.dropTable('full_period');
};
