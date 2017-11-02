exports.up = (knex) => {
  return knex.schema.createTableIfNotExists('meter_usage', (table) => {
    table.increments('id').primary();
    table.string('service_type').defaultTo('Water');
    table.string('read_type').defaultTo('Water');
    table.string('date').notNullable();
    table.integer('meter_num').notNullable();
    table.integer('previous').notNullable();
    table.integer('current').notNullable();
    table.integer('days').notNullable();
    table.integer('gal_usage').notNullable();

  });
};

exports.down = (knex) => {
  return knex.schema.dropTable('meter_usage');
};
