exports.up = (knex) => {
  return knex.schema.createTableIfNotExists('billing_period_budget', (table) => {
    table.increments('id').primary();
    table.integer('period_num').notNullable();
    table.string('status').defaultTo('AC');
    table.string('meter_date').notNullable();

    // table references
    // table.integer(full_period_id).unsigned().references('id').onDelete('CASCADE');

  });
};

exports.down = (knex) => {
  return knex.schema.dropTable('');
};
